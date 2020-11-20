package pmcep.web.miner.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class MinerView {

	public enum Type {
		RAW, GRAPHVIZ, BINARY, GOOGLE;
	}

	@Getter
	private String name;
	@Getter
	protected Object value;
	@Getter
	private Type type;
	
	public MinerView(String name, Object value, Type type) {
		this.name = name;
		this.value = value;
		this.type = type;
	}
}
