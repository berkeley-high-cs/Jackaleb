class step2NormalDistribution{
        public static double[] step2Normal(double mean, double predictedStandD){
            double low = mean * predictedStandD - 1.645;
            double high = mean * predictedStandD + 1.645;
            double[] normalVals = {low, high};
            return normalVals;
        }
    }