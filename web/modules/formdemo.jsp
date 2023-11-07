<div class="container">    
    <article>
        <form action="SendBookingInfor" method="post">
            <div class="grid">
                <label for="firstname">
                    First name
                    <input type="text" id="firstname" name="firstname" placeholder="First name" required>
                </label>

                <label for="lastname">
                    Last name
                    <input type="text" id="lastname" name="lastname" placeholder="Last name" required>
                </label>

            </div>

            <label for="email">Email address</label>
            <input type="email" id="email" name="email" placeholder="Email address" required>
            <small>We'll never share your email with anyone else.</small>

            <button type="submit">Submit</button>
        </form>
    </article>
</div>