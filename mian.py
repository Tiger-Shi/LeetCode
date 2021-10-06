from cal_distance import cal_distance
def run():
    point1_lat = 39.2186266952
    point2_lat = 39.08579871
    point1_lon = 117.8175961241
    point2_lon = 117.7040162
    Distance = cal_distance(lat1=point1_lat,lon1=point1_lon,lat2=point2_lat,lon2=point2_lon)
    distance = Distance.twopoint_distance()
    print(distance)
    
if __name__=='__main__':
    run()