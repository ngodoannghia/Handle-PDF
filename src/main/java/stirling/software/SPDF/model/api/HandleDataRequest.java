package stirling.software.SPDF.model.api;

import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class HandleDataRequest {

    @Schema(description = "The input files")
    private MultipartFile[] fileInput;

    @Schema(description = "JSON String")
    private String json;

	public MultipartFile[] getFileInput() {
		return fileInput;
	}

	public void setFileInput(MultipartFile[] fileInput) {
		this.fileInput = fileInput;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
    
    
}
