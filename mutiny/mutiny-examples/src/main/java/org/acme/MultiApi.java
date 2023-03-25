package org.acme;

import io.smallrye.mutiny.Multi;

public class MultiApi {

    public static void main(String[] args) {
        //Multi<UserProfile> users = this.users.getAllUsers();
        Multi<String> multi = Multi.createFrom().items("amadeo", "balbuena", "constantine", "dinamarca");
        multi
                .select().where(s -> s.length() > 3)
                .onItem().transform(String::toUpperCase)
                .onFailure().recoverWithCompletion()
                .onCompletion().continueWith("!")
                .subscribe().with(
                    item -> System.out.println("Received: " + item)
        );
    }
}
