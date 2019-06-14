<template>
  <div class="frloginView" id="frloginView">
    <div id="form">
      <form>
        <label for="email">Account</label>
        <input type="text" id="email" placeholder="请输入账号" autocomplete="off">
        <label for="password">Password</label>&nbsp;
      <i class="fas fa-eye"></i>
        <input id="password" placeholder="请输入密码" type="password">
        <button type="submit" v-on:click="submit">Log in</button>
      </form>
    </div>
  </div>
</template>

<script>
    export default {
      name: "FRLoginView",
      data: function() {
          return {
            passwordplacholder:"请输入密码"
          }
      },
      methods: {
          submit: function (event) {
            alert('Hello ' + this.name + '!')
            this.$router.push('/main')
          },

      }
    }
</script>

<style scoped>
  * {
    box-sizing: border-box;
    font-family: 'Nunito', sans-serif;
  }

  div#frloginView {
    align-items: center;
    background-color: #e2e2e5;
    display: flex;
    justify-content: center;
    width: 100%;
    height: 100%;
  }
  div#form button:hover {
    background-color: #eeeeee;
  }
  div#form {
    background-color: #34495e;
    border-radius: 5px;
    box-shadow: 0px 0px 30px 0px #666;
    color: #ecf0f1;
    width: 260px;
    padding: 35px;
  }
  /*div#login div#description h1,*/
  /*div#login div#description p {*/
  /*  margin: 0;*/
  /*}*/

  /*div#login div#description p {*/
  /*  font-size: 0.8em;*/
  /*  color: #95a5a6;*/
  /*  margin-top: 10px;*/
  /*}*/

  /*div#login div#form {*/
  /*  background-color: #34495e;*/
  /*  border-radius: 5px;*/
  /*  box-shadow: 0px 0px 30px 0px #666;*/
  /*  color: #ecf0f1;*/
  /*  width: 260px;*/
  /*  padding: 35px;*/
  /*}*/

  /*div#login div#form label,*/
  /*div#login div#form input {*/
  /*  outline: none;*/
  /*  width: 100%;*/
  /*}*/

  /*div#login div#form label {*/
  /*  color: #95a5a6;*/
  /*  font-size: 0.8em;*/
  /*}*/

  /*div#login div#form input {*/
  /*  background-color: transparent;*/
  /*  border: none;*/
  /*  color: #ecf0f1;*/
  /*  font-size: 1em;*/
  /*  margin-bottom: 20px;*/
  /*}*/

  /*div#login div#form ::placeholder {*/
  /*  color: #ecf0f1;*/
  /*  opacity: 1;*/
  /*}*/

  /*div#login div#form button {*/
  /*  background-color: #ffffff;*/
  /*  cursor: pointer;*/
  /*  border: none;*/
  /*  padding: 10px;*/
  /*  transition: background-color 0.2s ease-in-out;*/
  /*  width: 100%;*/
  /*}*/

  /*div#login div#form button:hover {*/
  /*  background-color: #eeeeee;*/
  /*}*/

  /*@media screen and (max-width: 600px) {*/
  /*  div#login {*/
  /*    align-items: unset;*/
  /*    background-color: unset;*/
  /*    display: unset;*/
  /*    justify-content: unset;*/
  /*  }*/

  /*  div#login div#description {*/
  /*    margin: 0 auto;*/
  /*    max-width: 350px;*/
  /*    width: 100%;*/
  /*  }*/

  /*  div#login div#form {*/
  /*    border-radius: unset;*/
  /*    box-shadow: unset;*/
  /*    width: 100%;*/
  /*  }*/

  /*  div#login div#form form {*/
  /*    margin: 0 auto;*/
  /*    max-width: 280px;*/
  /*    width: 100%;*/
  /*  }*/
  /*}*/
</style>
