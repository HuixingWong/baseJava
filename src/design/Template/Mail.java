package design.Template;

public class Mail {

    private String receiver;
    private String subject;
    private String chengwei;
    private String content;
    private String tail;

    public Mail(AdvTemplate advTemplate){

        this.subject = advTemplate.getAdvTittle();
        this.content = advTemplate.getAdvContent();


    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getChengwei() {
        return chengwei;
    }

    public void setChengwei(String chengwei) {
        this.chengwei = chengwei;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
