package stirling.software.SPDF.model.api.security;

import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFFile;

@Data
@EqualsAndHashCode(callSuper = true)
public class AddWatermarkRequest extends PDFFile {

    @Schema(
            description = "The watermark type (text or image)",
            allowableValues = {"text", "image"},
            required = true)
    private String watermarkType;

    @Schema(description = "The watermark text")
    private String watermarkText;

    @Schema(description = "The watermark image")
    private MultipartFile watermarkImage;

    @Schema(
            description = "The selected alphabet",
            allowableValues = {"roman", "arabic", "japanese", "korean", "chinese"},
            defaultValue = "roman")
    private String alphabet = "roman";

    @Schema(description = "The font size of the watermark text", example = "30")
    private float fontSize = 30;

    @Schema(description = "The rotation of the watermark in degrees", example = "0")
    private float rotation = 0;

    @Schema(description = "The opacity of the watermark (0.0 - 1.0)", example = "0.5")
    private float opacity;

    @Schema(description = "The width spacer between watermark elements", example = "50")
    private int widthSpacer;

    @Schema(description = "The height spacer between watermark elements", example = "50")
    private int heightSpacer;

	public String getWatermarkType() {
		return watermarkType;
	}

	public void setWatermarkType(String watermarkType) {
		this.watermarkType = watermarkType;
	}

	public String getWatermarkText() {
		return watermarkText;
	}

	public void setWatermarkText(String watermarkText) {
		this.watermarkText = watermarkText;
	}

	public MultipartFile getWatermarkImage() {
		return watermarkImage;
	}

	public void setWatermarkImage(MultipartFile watermarkImage) {
		this.watermarkImage = watermarkImage;
	}

	public String getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}

	public float getFontSize() {
		return fontSize;
	}

	public void setFontSize(float fontSize) {
		this.fontSize = fontSize;
	}

	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	public float getOpacity() {
		return opacity;
	}

	public void setOpacity(float opacity) {
		this.opacity = opacity;
	}

	public int getWidthSpacer() {
		return widthSpacer;
	}

	public void setWidthSpacer(int widthSpacer) {
		this.widthSpacer = widthSpacer;
	}

	public int getHeightSpacer() {
		return heightSpacer;
	}

	public void setHeightSpacer(int heightSpacer) {
		this.heightSpacer = heightSpacer;
	}
    
    
}
