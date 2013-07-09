package ironpeace;

import ironpeace.common.DoubleGetter;
import ironpeace.common.Prioritize;
import ironpeace.common.StringGetter;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Model> models = new ArrayList<Model>();
		
		Model model1 = new Model("model1", 1);
		models.add(model1);

		Model model2 = new Model("model2", 2);
		models.add(model2);

		Model model3 = new Model("model3", 3);
		models.add(model3);
		
		List<Model> prioritizedByDouble = Prioritize.byDouble(models, new DoubleGetterImpl());
		
		List<Model> prioritizedByString = Prioritize.byString(models, new StringGetterImpl());
	}
}

