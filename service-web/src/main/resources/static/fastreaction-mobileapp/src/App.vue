



<template>
  <div id="app">

    <!--  顶部 Header 区域  -->
    <!--  中间的 路由 router-view  区域  -->
    <!--  底部 Tabbar 区域  -->

<!--    <form class="mui-input-group">-->
<!--      <div class="mui-input-row">-->
<!--        <label>用户名</label>-->
<!--        <input type="text" class="mui-input-clear" placeholder="请输入用户名">-->
<!--      </div>-->
<!--      <div class="mui-input-row">-->
<!--        <label>密码</label>-->
<!--        <input type="password" class="mui-input-password" placeholder="请输入密码">-->
<!--      </div>-->
<!--      <div class="mui-button-row">-->
<!--        <button type="button" class="mui-btn mui-btn-primary" >确认</button>-->
<!--      </div>-->
<!--    </form>-->

<!--    <mt-header title="多个按钮">-->
<!--      <div slot="left">-->
<!--        <mt-button v-link="'/'" icon="back">返回</mt-button>-->
<!--        <mt-button @click="handleClose">关闭</mt-button>-->
<!--      </div>-->
<!--      <mt-button icon="more" slot="right"></mt-button>-->
<!--    </mt-header>-->

<!--    <nav class="mui-bar mui-bar-tab">-->
<!--      <router-link class="mui-tab-item mui-active" to="/email">-->
<!--        <span class="mui-icon mui-icon-email"><span class="mui-badge">9</span></span>-->
<!--        <span class="mui-tab-label">邮件</span>-->
<!--      </router-link>-->
<!--      <router-link class="mui-tab-item" to="/contacts">-->
<!--        <span class="mui-icon mui-icon-contact"></span>-->
<!--        <span class="mui-tab-label">通讯录</span>-->
<!--      </router-link>-->
<!--      <router-link class="mui-tab-item" to="/person">-->
<!--        <span class="mui-icon mui-icon-person"></span>-->
<!--        <span class="mui-tab-label">我的</span>-->
<!--      </router-link>-->
<!--    </nav>-->
<!--    <router-view/>-->
  <naviView></naviView>
  <loginView></loginView>
    <tabBarView></tabBarView>

  </div>
</template>


<script>
  import Vue from 'vue'
  import Login from './components/login/FRLoginView'
  import Navigation from './components/header/FRHeaderView'
  import Tabbar from './components/tabbar/FRTabbarView'
  Vue.component(Login.name, Login)
  Vue.component(Navigation.name, Navigation)
  Vue.component(Tabbar.name, Tabbar)

export default {
  name: 'App',

}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  /*color: #2c3e50;*/
  color: red;
}
</style>
