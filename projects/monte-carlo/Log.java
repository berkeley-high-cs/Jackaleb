class Log {
    public double[] calculateLog(double[] normalValues) {
        double logOfMin = Math.log(normalValues[0]);
        double logOfMax = Math.log(normalValues[1]);
        double[] logValues = {logOfMin, logOfMax};
        return logValues;
    }
    }  
