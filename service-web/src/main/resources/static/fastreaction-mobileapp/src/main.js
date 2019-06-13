// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router/index'
// import './lib/mui/css/mui.min.css'
// import './lib/mui/css/mui.css'
// header相关,tabBar相关

// import { Header, Tabbar, TabItem } from 'mint-ui';

Vue.config.productionTip = false

// header相关
// Vue.component(Header.name, Header);
// // tabBar相关
// Vue.component(Tabbar.name, Tabbar);
// Vue.component(TabItem.name, TabItem);

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
