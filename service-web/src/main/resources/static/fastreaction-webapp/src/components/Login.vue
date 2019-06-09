<template>
  <div class="login-container">
    <div class="login-box">
      <div class="avatar row">
        <div class="img-con con">
          <img src="../assets/avatar.jpeg" class="img-avatar"/>
        </div>
      </div>
      <div class="account row">
        <div class="input-con con">
          <input type="text" class="account" placeholder="账号"/>
        </div>
      </div>
      <div class="pwd row">
        <div class="input-con con">
          <input type="password" class="pwd" placeholder="密码"/>
        </div>
      </div>
      <div class="btn row">
        <div class="btn-con con">
          <a href="javascript:" class="login">登录</a>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Login',
    data () {
      return {
        msg: ''
      }
    },
    methods: {
      clickTitle() {
        alert('hello vuejs, nick to meet you!')
      }
    }

  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .login-box {
    font-family: "Arial","Microsoft YaHei","\9ED1\4F53","\5B8B\4F53",sans-serif;
    width: 18rem;
    margin: 0 auto;
    position: absolute;
    left: 0;
    right: 0;
    bottom: 25%;
    padding: 4rem 2rem 2rem 2rem;
    border: 1px solid #f0f0f0;
    border-radius: 4px;
    -webkit-box-shadow: 0 1px 4px #cfcfcf;
    box-shadow: 0 1px 30px #e0e0e0;
  }
  .login-box .row {
    text-align: left;
    padding: .3rem .6rem;
    border: 1px solid #DBDEDF;
  }
  .login-box .row.account {
    margin-bottom: -1px;
    border-radius: 2px;
  }
  .login-box .row input {
    display: inline-block;
    background: transparent;
    padding: .3rem;
    border: 0;
    width: 100%;
    padding-right: 0;
    padding-left: 0;
    background: none\0;
    color: #31353B!important\0;
    font-size: 1rem;
    outline: none;
  }
  .login-box .row.btn a {
    text-decoration: none;
    color: #fff;
    font-size: 1rem;
    line-height: 1rem;
  }
  .login-box .row.btn {
    margin-top: 1rem;
    text-align: center;
    background: #e65c5c;
    border: 0;
    border-radius: 2px;
    padding: .58rem;
  }
  .login-box .avatar.row {
    border: 0;
    margin: 0 auto 6.4rem auto;
    display: block;
    width: auto;
    position: relative;
    text-align: center;
  }
  .login-box .avatar.row .img-con {
    width: auto;
    margin: 0 auto;
    display: inline-block;
  }
  .login-box .avatar.row .img-con img.img-avatar {
    width: 6.4rem;
    height: 6.4rem;
    display: block;
    border: 1px solid #dbdedf;
    border-radius: 30rem;
    box-shadow: 0 0 1rem #ccc;
  }
</style>
