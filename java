<!DOCTYPE html>
<html lang="ht">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Tobeck – Chaje Bèl Moun</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #fdfdfd;
            margin: 0;
            padding: 0;
            color: #222;
        }
        header {
            background-color: #1a1a1a;
            color: white;
            padding: 20px;
            text-align: center;
        }
        h1 {
            margin: 0;
            font-size: 2em;
        }
        .gallery {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
            gap: 20px;
        }
        .photo-card {
            background: white;
            border: 1px solid #ccc;
            border-radius: 10px;
            padding: 10px;
            width: 250px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
            text-align: center;
        }
        .photo-card img {
            width: 100%;
            border-radius: 10px;
        }
        .btn {
            display: inline-block;
            margin-top: 10px;
            padding: 8px 15px;
            background: #ff4081;
            color: white;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
        }
        .like-count {
            margin-left: 10px;
            font-weight: bold;
            color: #555;
        }
        footer {
            text-align: center;
            padding: 20px;
            font-size: 14px;
            background-color: #f4f4f4;
        }
        @media (max-width: 600px) {
            .gallery {
                flex-direction: column;
                align-items: center;
            }
            .photo-card {
                width: 90%;
            }
        }
    </style>
</head>
<body>

<header>
    <h1>Tobeck – Chaje Bèl Moun</h1>
    <p>Yon espas pou pataje bote natirèl!</p>
</header>

<div class="gallery">

    <div class="photo-card">
        <img src="https://via.placeholder.com/250x300?text=Bel+Moun+1" alt="Bèl moun 1" />
        <div>
            <button class="btn like-btn">❤️ Like</button>
            <span class="like-count" id="like-count-1">0</span>
            <button class="btn share-btn">🔗 Pataje</button>
        </div>
    </div>

    <div class="photo-card">
        <img src="https://via.placeholder.com/250x300?text=Bel+Moun+2" alt="Bèl moun 2" />
        <div>
            <button class="btn like-btn">❤️ Like</button>
            <span class="like-count" id="like-count-2">0</span>
            <button class="btn share-btn">🔗 Pataje</button>
        </div>
    </div>

</div>

<footer>
    © 2025 Tobeck – Tout dwa rezève.
</footer>

<script>
    // JavaScript pou like ki konte
    document.querySelectorAll('.like-btn').forEach((btn, index) => {
        const countSpan = document.getElementById('like-count-' + (index + 1));
        // Chaje kantite like nan localStorage si genyen
        let likes = localStorage.getItem('likes-photo-' + (index + 1)) || 0;
        countSpan.textContent = likes;

        btn.addEventListener('click', () => {
            likes++;
            countSpan.textContent = likes;
            localStorage.setItem('likes-photo-' + (index + 1), likes);
        });
    });

    // JavaScript pou bouton pataje (kopi lyen nan clipboard)
    document.querySelectorAll('.share-btn').forEach((btn, index) => {
        btn.addEventListener('click', () => {
            const url = window.location.href;
            navigator.clipboard.writeText(url).then(() => {
                alert('Lyen sit la kopiye nan clipboard ou!');
            });
        });
    });
</script>

</body>
</html>
