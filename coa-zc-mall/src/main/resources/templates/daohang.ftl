<!-- 公用菜单导航 -->
<div id="topics"></div>
<script type="text/javascript">
  $(function () {
    $("#topics").load("/jjslogin/menuv2?sel=kp_manage", function () {
      console.log('menuv2 init done!');
    });
  });
</script>
