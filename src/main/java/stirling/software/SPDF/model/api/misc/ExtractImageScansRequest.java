package stirling.software.SPDF.model.api.misc;

import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ExtractImageScansRequest {
    @Schema(description = "The input file containing image scans", required = true)
    private MultipartFile fileInput;

    @Schema(
            description = "The angle threshold for the image scan extraction",
            defaultValue = "5",
            example = "5")
    private int angleThreshold = 5;

    @Schema(
            description = "The tolerance for the image scan extraction",
            defaultValue = "20",
            example = "20")
    private int tolerance = 20;

    @Schema(
            description = "The minimum area for the image scan extraction",
            defaultValue = "8000",
            example = "8000")
    private int minArea = 8000;

    @Schema(
            description = "The minimum contour area for the image scan extraction",
            defaultValue = "500",
            example = "500")
    private int minContourArea = 500;

    @Schema(
            description = "The border size for the image scan extraction",
            defaultValue = "1",
            example = "1")
    private int borderSize = 1;

	public MultipartFile getFileInput() {
		return fileInput;
	}

	public void setFileInput(MultipartFile fileInput) {
		this.fileInput = fileInput;
	}

	public int getAngleThreshold() {
		return angleThreshold;
	}

	public void setAngleThreshold(int angleThreshold) {
		this.angleThreshold = angleThreshold;
	}

	public int getTolerance() {
		return tolerance;
	}

	public void setTolerance(int tolerance) {
		this.tolerance = tolerance;
	}

	public int getMinArea() {
		return minArea;
	}

	public void setMinArea(int minArea) {
		this.minArea = minArea;
	}

	public int getMinContourArea() {
		return minContourArea;
	}

	public void setMinContourArea(int minContourArea) {
		this.minContourArea = minContourArea;
	}

	public int getBorderSize() {
		return borderSize;
	}

	public void setBorderSize(int borderSize) {
		this.borderSize = borderSize;
	}
    
    
}
