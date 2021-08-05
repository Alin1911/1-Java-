/*
 * Programare orientata pe obiecte
 * Seria CC
 * Laboratorul 9
 * Nan Mihai
 */

/**
 *
 * @author Nan Mihai
 */
import java.util.ArrayList;

public abstract class AMatrix<T extends Number> extends ArrayList<ArrayList<T>> {
	public abstract AMatrix<T> addition(AMatrix<T> m1);
	
	//Aduna doua elemente de tip T si intoarce rezultatul
	public abstract T sum(T obj1, T obj2);
}


class IntegerMatrix extends AMatrix<Integer>{

/*	public IntegerMatrix(){

		Integer [][]matrice= new Integer[3][3];
		//get(2).add(this.matrice);
		for(int i=0;i<3;i++){
			//this.add(new ArrayList<>());
			for(int j = 0; j < 3;j++)
		}

	}*/


	/*@Override
	public AMatrix<Integer> addition(AMatrix<Integer> m1) {
*//*		for(int i=0;i<3;i++){
			for(int j = 0; j <3;j++)
				get(i).add(m1.get(i).get(j),sum(m1.get(i).get(j),
		}
		return m1;*//*
	}*/

	@Override
	public AMatrix<Integer> addition(AMatrix<Integer> m1) {
		return null;
	}

	@Override
	public Integer sum(Integer obj1, Integer obj2) {
		return obj1+obj2;
	}

	public static void main(String[] args) {
		IntegerMatrix map =new IntegerMatrix();
		System.out.println("3");
		System.out.println(map.toString());
	}
}



