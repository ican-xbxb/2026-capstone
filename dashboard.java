<script>
document.addEventListener('DOMContentLoaded', () => {
    // 메가메뉴 링크 클릭 시 로그 출력
    document.querySelectorAll('.mega-menu a').forEach(link => {
        link.addEventListener('click', () => {
            console.log(`이동: ${link.textContent.trim()} -> ${link.getAttribute('href')}`);
        });
    });
});
</script>