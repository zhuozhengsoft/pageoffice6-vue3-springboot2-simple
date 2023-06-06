<script setup>
</script>
<template>
  <div id="main">
    <h3>待办文件列表</h3>
    <ol>
      <li>
        <a
          href="javascript:POBrowser.openWindow('showDoc','width=1150px;height=900px;');"
          >在线打开文档</a
        >
      </li>
    </ol>
  </div>
</template>
<style scoped>
#main {
  margin: 0 auto;
  width: 300px;
  text-align: center;
}
ol {
  text-align: left;
  border: solid 1px gray;
}

ol li {
  text-align: left;
  border-bottom: dotted 1px gray;
  height: 30px;
  margin-top: 10px;
}
</style>