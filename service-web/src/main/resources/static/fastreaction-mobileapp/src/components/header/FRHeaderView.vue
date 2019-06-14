<template>
  <div class="frheaderView">
    <header class="mui-bar mui-bar-nav">
      <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
      <h1 class="mui-title"> {{navititle}} </h1>
    </header>

  </div>
</template>

<script>
    import { Header } from 'mint-ui';
    import '../../lib/mui/css/mui.min.css'
    import '../../lib/mui/css/mui.css'

    export default {
      name: "FRHeaderView",
      components: {
        Header
      },
      data: function () {
        return {
          navititle : '新窗口'
        }
      }
    }

</script>

<style scoped>

</style>
