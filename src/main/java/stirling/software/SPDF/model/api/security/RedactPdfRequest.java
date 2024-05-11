package stirling.software.SPDF.model.api.security;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFFile;

@Data
@EqualsAndHashCode(callSuper = true)
public class RedactPdfRequest extends PDFFile {

    @Schema(description = "List of text to redact from the PDF", type = "string", required = true)
    private String listOfText;

    @Schema(description = "Whether to use regex for the listOfText", defaultValue = "false")
    private boolean useRegex;

    @Schema(description = "Whether to use whole word search", defaultValue = "false")
    private boolean wholeWordSearch;

    @Schema(description = "The color for redaction", defaultValue = "#000000")
    private String redactColor = "#000000";

    @Schema(description = "Custom padding for redaction", type = "number")
    private float customPadding;

    @Schema(description = "Convert the redacted PDF to an image", defaultValue = "false")
    private boolean convertPDFToImage;

	public String getListOfText() {
		return listOfText;
	}

	public void setListOfText(String listOfText) {
		this.listOfText = listOfText;
	}

	public boolean isUseRegex() {
		return useRegex;
	}

	public void setUseRegex(boolean useRegex) {
		this.useRegex = useRegex;
	}

	public boolean isWholeWordSearch() {
		return wholeWordSearch;
	}

	public void setWholeWordSearch(boolean wholeWordSearch) {
		this.wholeWordSearch = wholeWordSearch;
	}

	public String getRedactColor() {
		return redactColor;
	}

	public void setRedactColor(String redactColor) {
		this.redactColor = redactColor;
	}

	public float getCustomPadding() {
		return customPadding;
	}

	public void setCustomPadding(float customPadding) {
		this.customPadding = customPadding;
	}

	public boolean isConvertPDFToImage() {
		return convertPDFToImage;
	}

	public void setConvertPDFToImage(boolean convertPDFToImage) {
		this.convertPDFToImage = convertPDFToImage;
	}
    
    
}
