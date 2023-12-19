class StandardDev{
    public double estimatedVarience(double[] interval){
        // low = mean - stddev * 1.645
        double low = interval[0];
        double high = interval[1];
        double mean = (high + low) / 2.0;
        // stddev * 1.645 = mean - low
        // stddev = (mean - low) / 1.645
        return (mean - low) / 1.645;
    }
}