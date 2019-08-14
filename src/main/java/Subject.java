public class Subject {
	//data members
	private int subjectId;
	private String subjectName;

	//no argument constructor
	public Subject() {
	}

	//argument constructor
	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}

	//getter and setter methods
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Subject obj2 = (Subject) obj;
		return (this.subjectId == obj2.getSubjectId()) &&
				(this.subjectName.equals(obj2.getSubjectName()));
	}

	public int hashCode() {
		int tmp = 0;
		tmp = (subjectId + subjectName).hashCode();
		return tmp;
	}
}
