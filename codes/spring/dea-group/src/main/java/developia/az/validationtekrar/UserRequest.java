package developia.az.validationtekrar;

public class UserRequest {

    @ValidEmail
    private String email;

     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

