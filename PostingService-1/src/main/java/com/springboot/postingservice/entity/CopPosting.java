
	
	
	package com.springboot.postingservice.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="cop_posting")
	public class CopPosting {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int postingId;
		
		private String posting;
		
		@Column(unique=true)
		private int  copId;
		
		public CopPosting() {
			// TODO Auto-generated constructor stub
		}

		public int getPostingId() {
			return postingId;
		}

		public void setPostingId(int postingId) {
			this.postingId = postingId;
		}
		

		public String getPosting() {
			return posting;
		}

		public void setPosting(String posting) {
			this.posting = posting;
		}

		public int getCopId() {
			return copId;
		}

		public void setCopId(int copId) {
			this.copId = copId;
		}

		@Override
		public String toString() {
			return "CopPosting [postingId=" + postingId + ", posting=" + posting + ", copId=" + copId + "]";
		}

		

	}


