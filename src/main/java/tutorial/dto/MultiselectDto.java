package tutorial.dto;

public class MultiselectDto {

	public String[] select = new String[0];

	public void initialize() {
		select = new String[] { "2", "3" };
	}
}