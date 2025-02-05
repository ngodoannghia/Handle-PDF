package stirling.software.SPDF.model.api;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PDFWithImageFormatRequest extends PDFFile {

    @Schema(
            description = "The output image format e.g., 'png', 'jpeg', or 'gif'",
            allowableValues = {"png", "jpeg", "gif"})
    private String format;

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
    
    
}
