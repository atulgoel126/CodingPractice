## Online Stock Span

Design an algorithm to calculate the span of stock's price given its daily price list. The span of a stock's price on a particular day is defined as the maximum number of consecutive days (starting from today and going backwards) for which the stock price was less than or equal to today's price.
For example, if the price of a stock over the next 7 days was [100, 80, 60, 70, 60, 75, 85], the span of the stock's price on day 4 (index 3) would be 3, as the stock price has been less than or equal to 70 for the past 3 days (60, 70, 60).
Implement the StockSpanner class:
- StockSpanner() Initializes the object of the class.
- int next(int price) Returns the span of the stock's price given that today's price is price.