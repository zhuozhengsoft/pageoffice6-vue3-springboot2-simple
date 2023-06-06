<template>
  <div class="doc">
    演示: 文档<br/><br/>
    <!-- 此div用来加载PageOffice客户端控件 -->
    <div style="width:auto; height:700px;" v-html="poHtmlCode" ></div>
  </div>
</template>
  
<script>
	import axios from 'axios';
    export default {
        name: 'DocView',
        data(){
          return {
            poHtmlCode: '',
          }
        },
        created: function(){
          // 请求后端项目打开文件的controller方法
          axios.post("/api/doc/openFile").then((response) => {
            this.poHtmlCode = response.data;
          }).catch(function (err) {
            console.log(err)
          })
        },
        methods:{
          OnPageOfficeCtrlInit() {
            // PageOffice的初始化事件回调函数，您可以在这里添加自定义按钮
          },
          AfterDocumentOpened(){
            // PageOffice的文档打开后事件回调函数
          },
          BeforeDocumentSaved() {
            // PageOffice的文档保存前事件回调函数
          },
          AfterDocumentSaved() {
            // PageOffice的文档保存后事件回调函数
          }
        },
        mounted: function () {
          // 以下的为PageOffice事件的回调函数，名称不能改，否则PageOffice控件调用不到
          window.OnPageOfficeCtrlInit = this.OnPageOfficeCtrlInit;
          window.AfterDocumentOpened = this.AfterDocumentOpened;
          window.BeforeDocumentSaved = this.BeforeDocumentSaved;
          window.AfterDocumentSaved = this.AfterDocumentSaved;
        }
    }
</script>
