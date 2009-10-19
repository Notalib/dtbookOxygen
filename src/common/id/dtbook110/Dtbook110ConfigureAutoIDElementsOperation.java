package common.id.dtbook110;

import ro.sync.ecss.extensions.commons.id.ConfigureAutoIDElementsOperation;
import ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo;

public class Dtbook110ConfigureAutoIDElementsOperation extends
		ConfigureAutoIDElementsOperation {

	@Override
	protected GenerateIDElementsInfo getDefaultOptions() {
		return Dtbook110UniqueAttributesRecognizer.GENERATE_ID_DEFAULTS;
	}

	@Override
	protected String getListMessage() {
		return "Select elements for which you want auto id generation turned on";
	}

	@Override
	public String getDescription() {
		return "Configure auto id elements for dtbook v1.1.0";
	}

}