package stirling.software.SPDF.model.api.misc;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFFile;

@Data
@EqualsAndHashCode(callSuper = true)
public class AutoSplitPdfRequest extends PDFFile {

    @Schema(
            description =
                    "Flag indicating if the duplex mode is active, where the page after the divider also gets removed.",
            required = false,
            defaultValue = "false")
    private boolean duplexMode;

	public boolean isDuplexMode() {
		return duplexMode;
	}

	public void setDuplexMode(boolean duplexMode) {
		this.duplexMode = duplexMode;
	}
    
    
}
