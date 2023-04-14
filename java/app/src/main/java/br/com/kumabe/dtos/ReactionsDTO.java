package br.com.kumabe.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReactionsDTO {
	@JsonProperty("url")
	private String url;

	@JsonProperty("total_count")
	private Long totalCount;
	
    @JsonProperty("+1")
    private Long positive;
    
    @JsonProperty("-1")
    private Long negative;
    
    @JsonProperty("laugh")
    private Long laugh;
    
    @JsonProperty("hooray")
    private Long hooray;
    
    @JsonProperty("confused")
    private Long confused;
    
    @JsonProperty("heart")
    private Long heart;
    
    @JsonProperty("rocket")
    private Long rocket;
    
    @JsonProperty("eyes")
    private Long eyes;
    
    public ReactionsDTO() {}

	public ReactionsDTO(String url, Long totalCount, Long positive, Long negative, Long laugh, Long hooray,
			Long confused, Long heart, Long rocket, Long eyes) {
		super();
		this.url = url;
		this.totalCount = totalCount;
		this.positive = positive;
		this.negative = negative;
		this.laugh = laugh;
		this.hooray = hooray;
		this.confused = confused;
		this.heart = heart;
		this.rocket = rocket;
		this.eyes = eyes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPositive() {
		return positive;
	}

	public void setPositive(Long positive) {
		this.positive = positive;
	}

	public Long getNegative() {
		return negative;
	}

	public void setNegative(Long negative) {
		this.negative = negative;
	}

	public Long getLaugh() {
		return laugh;
	}

	public void setLaugh(Long laugh) {
		this.laugh = laugh;
	}

	public Long getHooray() {
		return hooray;
	}

	public void setHooray(Long hooray) {
		this.hooray = hooray;
	}

	public Long getConfused() {
		return confused;
	}

	public void setConfused(Long confused) {
		this.confused = confused;
	}

	public Long getHeart() {
		return heart;
	}

	public void setHeart(Long heart) {
		this.heart = heart;
	}

	public Long getRocket() {
		return rocket;
	}

	public void setRocket(Long rocket) {
		this.rocket = rocket;
	}

	public Long getEyes() {
		return eyes;
	}

	public void setEyes(Long eyes) {
		this.eyes = eyes;
	}

	@Override
	public String toString() {
		return "ReactionsDTO [url=" + url + ", totalCount=" + totalCount + ", positive=" + positive + ", negative="
				+ negative + ", laugh=" + laugh + ", hooray=" + hooray + ", confused=" + confused + ", heart=" + heart
				+ ", rocket=" + rocket + ", eyes=" + eyes + "]";
	}
    
    
}