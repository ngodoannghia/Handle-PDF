package stirling.software.SPDF.model.api.misc;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFWithPageNums;

@Data
@EqualsAndHashCode(callSuper = true)
public class AddPageNumbersRequest extends PDFWithPageNums {

    @Schema(
            description = "Custom margin: small/medium/large",
            allowableValues = {"small", "medium", "large"})
    private String customMargin;

    @Schema(description = "Position: 1 of 9 positions", minimum = "1", maximum = "9")
    private int position;

    @Schema(description = "Starting number", minimum = "1")
    private int startingNumber;

    @Schema(description = "Which pages to number, default all")
    private String pagesToNumber;

    @Schema(
            description =
                    "Custom text: defaults to just number but can have things like \"Page {n} of {p}\"")
    private String customText;

	public String getCustomMargin() {
		return customMargin;
	}

	public void setCustomMargin(String customMargin) {
		this.customMargin = customMargin;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getStartingNumber() {
		return startingNumber;
	}

	public void setStartingNumber(int startingNumber) {
		this.startingNumber = startingNumber;
	}

	public String getPagesToNumber() {
		return pagesToNumber;
	}

	public void setPagesToNumber(String pagesToNumber) {
		this.pagesToNumber = pagesToNumber;
	}

	public String getCustomText() {
		return customText;
	}

	public void setCustomText(String customText) {
		this.customText = customText;
	}
    
    
}
