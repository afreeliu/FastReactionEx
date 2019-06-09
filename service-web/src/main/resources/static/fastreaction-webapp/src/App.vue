<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
html {
  height: 100%;
  overflow-y: hidden;
  overflow-x: auto;
}
body {
  position: relative;
  height: 100%;
  margin: 0;
  padding: 0;
}
input:-webkit-autofill,
textarea:-webkit-autofill,
select:-webkit-autofill {
  -webkit-box-shadow: 0 0 0 1000px white inset;
}
#app {
  font-family: Helvetica Neue,Helvetica,PingFang SC,Tahoma,Arial,sans-serif;
  text-align: center;
  color: #2c3e50;
}

</style>
