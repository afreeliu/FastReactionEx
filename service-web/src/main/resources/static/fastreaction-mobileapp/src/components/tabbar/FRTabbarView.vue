<template>
  <div class="tabBarView">
        <nav class="mui-bar mui-bar-tab">
          <router-link class="mui-tab-item mui-active" to="/email">
            <span class="mui-icon mui-icon-email"><span class="mui-badge">0</span></span>
            <span class="mui-tab-label">邮件</span>
          </router-link>
          <router-link class="mui-tab-item" to="/contacts">
            <span class="mui-icon mui-icon-contact"></span>
            <span class="mui-tab-label">通讯录</span>
          </router-link>
          <router-link class="mui-tab-item" to="/person">
            <span class="mui-icon mui-icon-person"></span>
            <span class="mui-tab-label">我的</span>
          </router-link>
        </nav>
  </div>
</template>

<script>

  import { Tabbar, TabItem } from 'mint-ui';
  import '../../lib/mui/css/mui.min.css'
  import '../../lib/mui/css/mui.css'

  export default {
    name: "tabBarView",
    components: {
      Tabbar,
      TabItem
    }
  }
</script>

<style scoped>

</style>
