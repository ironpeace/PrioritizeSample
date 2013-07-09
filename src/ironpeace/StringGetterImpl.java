package ironpeace;

import ironpeace.common.StringGetter;

public class StringGetterImpl implements StringGetter<Model> {
	@Override
	public String get(Model in){
		return in.getText();
	}

}
