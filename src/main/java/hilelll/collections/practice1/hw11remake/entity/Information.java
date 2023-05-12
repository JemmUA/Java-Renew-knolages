package hilelll.collections.practice1.hw11remake.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {
    List<String> nicknames;
    Set<String> emails;
    Map<String, String> emailNickname;

    public Information() {
    }

    public Information(List<String> nicknames, Set<String> emails, Map<String, String> emailNickname) {
        this.nicknames = nicknames;
        this.emails = emails;
        this.emailNickname = emailNickname;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    public Map<String, String> getEmailNickname() {
        return emailNickname;
    }

    public void setEmailNickname(Map<String, String> emailNickname) {
        this.emailNickname = emailNickname;
    }
}
