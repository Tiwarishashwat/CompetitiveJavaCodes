int candles(int candlesNumber, int makeNew) {
    int burned=candlesNumber;
    int leftovers=candlesNumber;
    while(leftovers>=makeNew)
    {
        burned=burned+(leftovers/makeNew);
        leftovers=(leftovers/makeNew)+(leftovers%makeNew);
    }
    return burned;
}
