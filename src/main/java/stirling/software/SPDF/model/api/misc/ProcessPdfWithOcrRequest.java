package stirling.software.SPDF.model.api.misc;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFFile;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessPdfWithOcrRequest extends PDFFile {

    @Schema(description = "List of languages to use in OCR processing")
    private List<String> languages;

    @Schema(description = "Include OCR text in a sidecar text file if set to true")
    private boolean sidecar;

    @Schema(description = "Deskew the input file if set to true")
    private boolean deskew;

    @Schema(description = "Clean the input file if set to true")
    private boolean clean;

    @Schema(description = "Clean the final output if set to true")
    private boolean cleanFinal;

    @Schema(
            description = "Specify the OCR type, e.g., 'skip-text', 'force-ocr', or 'Normal'",
            allowableValues = {"skip-text", "force-ocr", "Normal"})
    private String ocrType;

    @Schema(
            description = "Specify the OCR render type, either 'hocr' or 'sandwich'",
            allowableValues = {"hocr", "sandwich"},
            defaultValue = "hocr")
    private String ocrRenderType = "hocr";

    @Schema(description = "Remove images from the output PDF if set to true")
    private boolean removeImagesAfter;

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	public boolean isDeskew() {
		return deskew;
	}

	public void setDeskew(boolean deskew) {
		this.deskew = deskew;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public boolean isCleanFinal() {
		return cleanFinal;
	}

	public void setCleanFinal(boolean cleanFinal) {
		this.cleanFinal = cleanFinal;
	}

	public String getOcrType() {
		return ocrType;
	}

	public void setOcrType(String ocrType) {
		this.ocrType = ocrType;
	}

	public String getOcrRenderType() {
		return ocrRenderType;
	}

	public void setOcrRenderType(String ocrRenderType) {
		this.ocrRenderType = ocrRenderType;
	}

	public boolean isRemoveImagesAfter() {
		return removeImagesAfter;
	}

	public void setRemoveImagesAfter(boolean removeImagesAfter) {
		this.removeImagesAfter = removeImagesAfter;
	}
    
    
}
