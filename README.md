<h1 align="center">Spring Boot: разные скоупы бинов</h1>

<p>Это приложение на <strong>Spring Boot</strong>, демонстрирующее использование <strong>Singleton</strong>, <strong>Prototype</strong> и <strong>RequestScope</strong> бинов. Приложение предоставляет простой REST API для тестирования поведения этих разных скоупов.</p>

<h2>Особенности</h2>
<ul>
    <li><strong>Singleton Bean:</strong> Создаётся только один экземпляр бина, который используется во всей приложении.</li>
    <li><strong>Prototype Bean:</strong> Каждый раз при запросе создаётся новый экземпляр бина.</li>
    <li><strong>RequestScope Bean:</strong> Для каждого HTTP запроса создаётся новый экземпляр бина.</li>
</ul>

<h2>Как протестировать</h2>

<p>1. <strong>Проверка Singleton и Prototype:</strong> Вы можете проверить поведение этих бинов, запустив приложение и увидев их поведение в <code>BeanTest.java</code>.</p>

<p>2. <strong>Проверка RequestScope:</strong> Откройте браузер или используйте <code>curl</code>, чтобы сделать запрос на API:</p>

<pre>
curl http://localhost:8080/api/request-bean
</pre>
