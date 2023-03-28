package com.tenco.todo.dto;

public class TodoDTO {
	
	private int id;
	private String title;
	private String description;
	private int priority;
	private int completed;
	private String createdAt;
	
	
	public TodoDTO(int id, String title, String description, int priority, int completed, String name) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = completed;
		this.createdAt = name;
	}
	@Override
	public String toString() {
		return "CategoryDTO [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", completed=" + completed + ", createdAt=" + createdAt + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getCompleted() {
		return completed;
	}
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
}
