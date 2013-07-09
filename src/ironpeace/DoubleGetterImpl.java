package ironpeace;

import ironpeace.common.DoubleGetter;

public class DoubleGetterImpl implements DoubleGetter<Model> {
	@Override
	public double get(Model in) {
		return in.getNumber();
	}
}
