package stirling.software.SPDF.model.api.misc;

import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFWithPageNums;

@Data
@EqualsAndHashCode(callSuper = true)
public class AddStampRequest extends PDFWithPageNums {

    @Schema(
            description = "The stamp type (text or image)",
            allowableValues = {"text", "image"},
            required = true)
    private String stampType;

    @Schema(description = "The stamp text")
    private String stampText;

    @Schema(description = "The stamp image")
    private MultipartFile stampImage;

    @Schema(
            description = "The selected alphabet",
            allowableValues = {"roman", "arabic", "japanese", "korean", "chinese"},
            defaultValue = "roman")
    private String alphabet = "roman";

    @Schema(description = "The font size of the stamp text", example = "30")
    private float fontSize = 30;

    @Schema(description = "The rotation of the stamp in degrees", example = "0")
    private float rotation = 0;

    @Schema(description = "The opacity of the stamp (0.0 - 1.0)", example = "0.5")
    private float opacity;

    @Schema(
            description =
                    "Position for stamp placement based on a 1-9 grid (1: bottom-left, 2: bottom-center, ..., 9: top-right)",
            example = "1")
    private int position;

    @Schema(
            description =
                    "Override X coordinate for stamp placement. If set, it will override the position-based calculation. Negative value means no override.",
            example = "-1")
    private float overrideX = -1; // Default to -1 indicating no override

    @Schema(
            description =
                    "Override Y coordinate for stamp placement. If set, it will override the position-based calculation. Negative value means no override.",
            example = "-1")
    private float overrideY = -1; // Default to -1 indicating no override

    @Schema(
            description = "Specifies the margin size for the stamp.",
            allowableValues = {"small", "medium", "large", "x-large"},
            defaultValue = "medium")
    private String customMargin = "medium";

    @Schema(description = "The color for stamp", defaultValue = "#d3d3d3")
    private String customColor = "#d3d3d3";

	public String getStampType() {
		return stampType;
	}

	public void setStampType(String stampType) {
		this.stampType = stampType;
	}

	public String getStampText() {
		return stampText;
	}

	public void setStampText(String stampText) {
		this.stampText = stampText;
	}

	public MultipartFile getStampImage() {
		return stampImage;
	}

	public void setStampImage(MultipartFile stampImage) {
		this.stampImage = stampImage;
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

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public float getOverrideX() {
		return overrideX;
	}

	public void setOverrideX(float overrideX) {
		this.overrideX = overrideX;
	}

	public float getOverrideY() {
		return overrideY;
	}

	public void setOverrideY(float overrideY) {
		this.overrideY = overrideY;
	}

	public String getCustomMargin() {
		return customMargin;
	}

	public void setCustomMargin(String customMargin) {
		this.customMargin = customMargin;
	}

	public String getCustomColor() {
		return customColor;
	}

	public void setCustomColor(String customColor) {
		this.customColor = customColor;
	}
    
    
}
