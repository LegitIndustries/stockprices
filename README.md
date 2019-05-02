## Approach

First approach involved processing all possible records while maintaining the largest profit which is ```n^2``` complexity.
Second (submitted) approach does something similar, but just keeps track of the smallest price rather than iterating over the list again.

## Caveats

 - I have not taken into account for the opening/closing times of the stock market.
 - Rather than using ```BigDecimal``` to store cents, I've used ```int``` as per the question.
 - For an invalid or input that does not provide a profit, I am returning 0.
 - A stock price can't be negative.
