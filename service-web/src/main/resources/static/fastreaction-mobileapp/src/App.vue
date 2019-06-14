



<template>
  <div id="app">

    <transition name="router-fade" mode="out-in">
      <keep-alive>
        <router-view></router-view>
      </keep-alive>
    </transition>

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
  data: function () {
    return {
      isLogin: false
    }
  },
  methods: {
  }
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
