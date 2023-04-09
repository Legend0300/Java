public class Skills {
    String name;
    String Note;
    DateAndTime date;  


    Skills(String name, String Note, DateAndTime date){
        this.name = name;
        this.Note = Note;
        this.date = date;
    }

    public DateAndTime getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return Note;
    }

    public void setDate(DateAndTime date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        Note = note;
    }


    public void AddSkill(){
        System.out.println("Add Skill");
    }

    public void RemoveSkill(){
        System.out.println("Remove Skill");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "skill: " + name + Note + date;
    }
}
