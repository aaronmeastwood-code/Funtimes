import time
import requests

# Replace with a real QLD Traffic camera image URL
camera_url = "https://www.qldtraffic.qld.gov.au/camera/12345.jpg"

for i in range(1, 4):
    print(f"Downloading image {i}...")
    try:
        response = requests.get(camera_url)
        response.raise_for_status()
        filename = f"camera_image_{i}.jpg"
        with open(filename, "wb") as f:
            f.write(response.content)
        print(f"Image {i} saved as {filename}")
    except Exception as e:
        print(f"Failed to download image {i}: {e}")
    if i < 3:
        print("Waiting 15 seconds before next download...")
        time.sleep(15)

print("Done!")
