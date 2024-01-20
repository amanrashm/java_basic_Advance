SQL: E-commerce Warehouse Stock & Returns Report

An e-commerce company maintains records of its warehouse stock. The warehouse team records incoming stock, and the customer service team records any stock that is returned by customers. The database contains information from June through August of 2023.

The company wants to maintain a report that displays the current stock count for each product, considering both incoming stock and returned items.

The result should have the following columns: id / title | total_stock / total_returns.

•d the product ID

⚫title-the product title

• total stock-the total number of the product in stock

⚫ total returns-the total number of returns for the product

The result should be sorted in ascending order by id.

Note:

• Only returns in July, 2023 should be included in the report.

• The total_returns column should be 0 for products that have no returns.
// write query for postgres
SELECT
    id,
    title,
    SUM(CASE WHEN month = 7 THEN stock ELSE 0 END) AS total_stock,
    SUM(CASE WHEN month = 7 THEN returns ELSE 0 END) AS total_returns
FROM
    (
        SELECT
            id,
            title,
            EXTRACT(MONTH FROM date) AS month,
            SUM(CASE WHEN type = 'stock' THEN quantity ELSE 0 END) AS stock,
            SUM(CASE WHEN type = 'return' THEN quantity ELSE 0 END) AS returns
        FROM
            warehouse
        GROUP BY
            id,
            title,
            EXTRACT(MONTH FROM date)
    ) AS t
GROUP BY
    id,
    title
ORDER BY
    id ASC;


SQL: Game Streaming Service User Engagement Analysis

A popular game streaming service wants insight into user engagement on their platform. They will analyze both short and long streams and determine how user engagement varies between them.

The result should have the following columns: username | total_streams | avg_stream_duration | total_viewers |

uniq_viewers_gt_30min / uniq_viewers_Ite_30min.

username-the streamer username

• total_streams - the total number of streams for a specific streamer

avg_stream_duration - the average duration of the stream for a specific streamer, rounded up to the nearest integer. l.e. 20.01 and 20.99 round to 21.

total_viewers-the total number of viewer streams for a specific streamer

uniq_viewers_gt_30min - the total number of unique viewers who watched streams for more than 30 minutes

• uniq_viewers_Ite_30min - the total number of unique viewers who watched streams for less than or equal to 30 minutes

The results should be sorted in ascending order by username.

Note:

• Each stream might have non-unique viewers, e.g. when someone watches the same stream on multiple devices.
// write query for postgres

SELECT
    username,
    COUNT(DISTINCT stream_id) AS total_streams,
    CEIL(AVG(duration)) AS avg_stream_duration,
    COUNT(DISTINCT viewer_id) AS total_viewers,
    COUNT(DISTINCT CASE WHEN duration > 30 THEN viewer_id ELSE NULL END) AS uniq_viewers_gt_30min,
    COUNT(DISTINCT CASE WHEN duration <= 30 THEN viewer_id ELSE NULL END) AS uniq_viewers_lte_30min
FROM
    streams
GROUP BY
    username
ORDER BY
    username ASC;

