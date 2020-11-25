package pmcep.web.miner.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import pmcep.web.miner.models.MinerParameter.Type;

public class MinerParameterValue {

	@Getter @Setter
	private String name;
	@Getter @Setter
	private Object value;
	@Getter @Setter @JsonIgnore
	private MinerParameter.Type type;
	
	public MinerParameterValue(String name, Object value) {
		this.name = name;
		this.value = value;
		
		if (value instanceof String) {
			this.type = Type.STRING;
		} else if (value instanceof Integer) {
			this.type = Type.INTEGER;
		} else if (value instanceof Double) {
			this.type = Type.DOUBLE;
		}
	}
}
