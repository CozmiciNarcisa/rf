package Lab3_RF;

public class DistanceUtils {
	
	public static double DistanceEuclidian(double[] pattern1, double[] pattern2)
    {
        double Sum = 0.0;
        for(int i=0;i<2;i++) {
           Sum = Sum + Math.pow((pattern1[i]-pattern2[i]),2.0);
        }
        return Math.sqrt(Sum);
    }
	
	public static double DistanceCebisev(double[] pattern1, double[] pattern2) {
		double max = Double.NEGATIVE_INFINITY;
		for (int count = 0; count < pattern1.length; count++) {
			max = Double.max(max, Math.abs(pattern1[count] - pattern2[count]));
		}
		return max;
	}
	
	public static double DistanceMalahanubis(double[] pattern1, double[] pattern2, double patternCount) {
		double sum = 0;
		for (int count = 0; count < pattern1.length; count++) {
			sum += Math.pow(pattern1[count] - pattern2[count], patternCount);
		}
		return Math.pow(sum, (1/patternCount));
	}
	public static double DistanceCityBlock(double[] pattern1, double[] pattern2) {
		double sum = 0;
		for (int count = 0; count < pattern1.length; count++) {
			sum += Math.abs(pattern1[count] - pattern2[count]);
		}
		return sum;
	}
}
