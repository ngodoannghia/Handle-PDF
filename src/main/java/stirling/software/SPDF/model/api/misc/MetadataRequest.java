package stirling.software.SPDF.model.api.misc;

import java.util.Map;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFFile;

@Data
@EqualsAndHashCode(callSuper = true)
public class MetadataRequest extends PDFFile {

    @Schema(description = "Delete all metadata if set to true")
    private boolean deleteAll;

    @Schema(description = "The author of the document")
    private String author;

    @Schema(description = "The creation date of the document (format: yyyy/MM/dd HH:mm:ss)")
    private String creationDate;

    @Schema(description = "The creator of the document")
    private String creator;

    @Schema(description = "The keywords for the document")
    private String keywords;

    @Schema(description = "The modification date of the document (format: yyyy/MM/dd HH:mm:ss)")
    private String modificationDate;

    @Schema(description = "The producer of the document")
    private String producer;

    @Schema(description = "The subject of the document")
    private String subject;

    @Schema(description = "The title of the document")
    private String title;

    @Schema(description = "The trapped status of the document")
    private String trapped;

    @Schema(
            description =
                    "Map list of key and value of custom parameters. Note these must start with customKey and customValue if they are non-standard")
    private Map<String, String> allRequestParams;

	public boolean isDeleteAll() {
		return deleteAll;
	}

	public void setDeleteAll(boolean deleteAll) {
		this.deleteAll = deleteAll;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(String modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrapped() {
		return trapped;
	}

	public void setTrapped(String trapped) {
		this.trapped = trapped;
	}

	public Map<String, String> getAllRequestParams() {
		return allRequestParams;
	}

	public void setAllRequestParams(Map<String, String> allRequestParams) {
		this.allRequestParams = allRequestParams;
	}
    
    
}
