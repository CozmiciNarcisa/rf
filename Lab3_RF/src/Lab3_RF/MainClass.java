package Lab3_RF;

public class MainClass {
	
	
	public static void main(String[] args) {
		double[][] learningSet;
		try {
			learningSet = FileUtils.readLearningSetFromFile("in.txt");
			int numberOfPatterns = learningSet.length;
			int numberOfFeatures = learningSet[0].length;
			for(int count=1;count<learningSet.length; count++) {
				double DistanceEuclidian=DistanceUtils.DistanceEuclidian(learningSet[0], learningSet[count]);
				System.out.println("Distanta Euclidiana intre 1 si " +count + " este "+DistanceEuclidian );
				double DistanceCebisev=DistanceUtils.DistanceCebisev(learningSet[0], learningSet[count]);
				System.out.println("Maximul este" + DistanceCebisev);
				double DistanceMalahanubis=DistanceUtils.DistanceMalahanubis(learningSet[0], learningSet[1],learningSet[0].length);
				System.out.println("Distanta Mahalanubis intre 0 si "+ count+ " este " + DistanceMalahanubis);
				double DistanceCityBlock=DistanceUtils.DistanceCityBlock(learningSet[0], learningSet[1]);
				System.out.println("Distanta CityBlock intre 0 si " + count + " este " + DistanceCityBlock);
			}
			
			System.out.println(String.format("The learning set has %s patters and %s features", numberOfPatterns, numberOfFeatures));
		} catch (USVInputFileCustomException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finished learning set operations");
		}
	}

}